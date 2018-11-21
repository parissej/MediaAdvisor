import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ApiTestCompsantComponent } from './api-test-compsant.component';

describe('ApiTestCompsantComponent', () => {
  let component: ApiTestCompsantComponent;
  let fixture: ComponentFixture<ApiTestCompsantComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ApiTestCompsantComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ApiTestCompsantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
